package co.com.bancolombia.dojoinjectmocksexercise.exercises;

import co.com.bancolombia.dojoinjectmocksexercise.fakelibraries.UserRepository;

public class ExerciseTwoUserManagement {

    public boolean checkSpecificUser (String id) {
        UserRepository userRepository = new UserRepository();
        String user = userRepository.findOne(id);
        if (user.equals("My Favorite User")) {
            return true;
        }
        return false;
    }

    public boolean deleteById (String id) throws Exception {
        UserRepository userRepository = new UserRepository();
        boolean response = userRepository.delete(id);
        if (response) {
            return true;
        } else {
            throw new Exception("Exception delete action");
        }
    }

    public String saveNewUser (String id) {
        boolean response = UserRepository.save("New User Name");
        if (response) {
            return "Everything is ok with static method";
        }
        return "Something is wrong";
    }

}
