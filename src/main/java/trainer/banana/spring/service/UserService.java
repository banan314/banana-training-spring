package trainer.banana.spring.service;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import lombok.val;
import trainer.banana.spring.model.*;
import trainer.banana.spring.repository.UserRepository;

@Service
public class UserService{
  
  @Inject 
  UserRepository userRepository;

  public Optional<User> getUser(int id) {
    return userRepository.findById(id);
  }

// public void addUser(User user) {
// this.user=user;
// }

// public void updateUser(User user, int id) {
//     this.user=user;
//     is.id =id; 
// }


} 