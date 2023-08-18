package com.ananda.springcore;

import com.ananda.springcore.controller.StudentController;
import com.ananda.springcore.entity.Student;
import com.ananda.springcore.repository.StudentRepository;
import com.ananda.springcore.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;

@WebMvcTest(StudentController.class)
public class SpringCoreStudentControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentService studentService;
    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/test")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("done!")));
    }

    @Test
    public void shouldGetStudentData() throws Exception {
        List<Student> studentsData = new ArrayList<Student>();
        Student student = new Student("firstName", "lastName");
        studentsData.add(student);
         when(studentRepository.findAll()).thenReturn(studentsData);
        this.mockMvc.perform(get("/students")).andExpect(status().isOk())
                .andExpect(content().string(containsString("done!")));
    }
}
