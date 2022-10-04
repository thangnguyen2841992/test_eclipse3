package com.directory.service.excercise;

import com.directory.IGeneralService;
import com.directory.model.dto.ExcerciseDTO;
import com.directory.model.entity.Excercise;

public interface IExcerciseService extends IGeneralService<Excercise> {

    Iterable<Excercise> getExcercisesByBook_IdAndLesson_Id(Long bookId, Long lessonId);

    Iterable<ExcerciseDTO> getExcerciseDTO(Iterable<Excercise> excercises);
}
