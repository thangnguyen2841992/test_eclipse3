package com.directory.service.question;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.Question;
import com.directory.repository.IQuestionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService implements IQuestionService{
    @Autowired
    private IQuestionRepository questionRepository;

    @Override
    public List<Question> saveAll(List<Question> questions) {
        return this.questionRepository.saveAll(questions);
    }

    @Override
    public Iterable<Question> getQuestionsByExcercise_Id(Long excerciseId) {
        return this.questionRepository.getQuestionsByExcercise_Id(excerciseId);
    }

	@Override
	public Iterable<Question> findAll() {
		// TODO Auto-generated method stub
		return this.questionRepository.findAll();
	}

	@Override
	public Optional<Question> findById(Long id) {
		// TODO Auto-generated method stub
		return this.questionRepository.findById(id);
	}

	@Override
	public Question save(Question t) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.questionRepository.deleteById(id);
	}
}
