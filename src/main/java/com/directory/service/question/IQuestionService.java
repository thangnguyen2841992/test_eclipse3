package com.directory.service.question;




import java.util.List;

import com.directory.IGeneralService;
import com.directory.model.entity.Question;

public interface IQuestionService extends IGeneralService<Question> {
    List<Question> saveAll(List<Question> questions);

    Iterable<Question> getQuestionsByExcercise_Id(Long excerciseId);

}
