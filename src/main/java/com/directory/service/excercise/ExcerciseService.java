package com.directory.service.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.dto.ExcerciseDTO;
import com.directory.model.entity.Excercise;
import com.directory.repository.IExcerciseRepository;
import com.directory.repository.IQuestionRepository;
import com.directory.service.question.IQuestionService;

@Service
public class ExcerciseService implements IExcerciseService{
	@Autowired
	private IExcerciseRepository excerciseRepository;
	
	@SuppressWarnings("unused")
	@Autowired
	private IQuestionService questionService;

	@Override
	public Iterable<Excercise> findAll() {
		// TODO Auto-generated method stub
		return this.excerciseRepository.findAll();
	}

	@Override
	public Optional<Excercise> findById(Long id) {
		// TODO Auto-generated method stub
		return this.excerciseRepository.findById(id);
	}

	@Override
	public Excercise save(Excercise t) {
		// TODO Auto-generated method stub
		return this.excerciseRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.excerciseRepository.deleteById(id);
	}

	@Override
	public Iterable<Excercise> getExcercisesByBook_IdAndLesson_Id(Long bookId, Long lessonId) {
		// TODO Auto-generated method stub
		return this.excerciseRepository.getExcercisesByBook_IdAndLesson_IdOrderById(bookId, lessonId);
	}

	@Override
	public Iterable<ExcerciseDTO> getExcerciseDTO(Iterable<Excercise> excercises) {
		// TODO Auto-generated method stub
	    List<Excercise> excerciseList = (List<Excercise>) excercises;
        List<ExcerciseDTO> excerciseDTOList = new ArrayList<>();
        for (int i = 0; i < excerciseList.size(); i++) {
            excerciseDTOList.add( new ExcerciseDTO(excerciseList.get(i).getId(),
                                excerciseList.get(i).getName(),
                                excerciseList.get(i).getCaption(),
                                excerciseList.get(i).getAudioFile(),
                                this.questionService.getQuestionsByExcercise_Id(excerciseList.get(i).getId())));
        }
        return excerciseDTOList;
	}
  

   
}
