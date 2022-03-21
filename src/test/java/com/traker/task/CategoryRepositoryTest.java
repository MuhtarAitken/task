//package com.traker.task;
//
//import com.traker.task.models.Category;
//import com.traker.task.repo.CategoryRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//@AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//public class CategoryRepositoryTest {
//    @Autowired
//    private CategoryRepository repo;
//    @Test
//    public void testCreateCategory() {
//       Category saveCategory = repo.save(new Category("task 1"));
//
//       assertThat(saveCategory.getId()).isGreaterThan(0);
//    }
//}
