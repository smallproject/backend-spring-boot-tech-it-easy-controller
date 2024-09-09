package nl.novi.spring_boot_tech_it_easy_controller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {


    @GetMapping("/televisions")
    public ResponseEntity<String> getAllTelevisions() {
//        response return 200 status with string
        return ResponseEntity.ok("televisions");
    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<String> getTelevisionbyId(@PathVariable int id) {
//        response return 200 status with specific string id
        return ResponseEntity.ok("television with id: " + id);
    }

    @PostMapping("/televisions")
    public ResponseEntity<String> createTelevision(@RequestBody String television) {
        // television creation
        //return 201 response status and a string
        return ResponseEntity.created(null).body("televisions");
    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<String> updateTelevision(@RequestBody String television) {
        //television update
        //return 204 response status
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<String> deleteTelevision(@PathVariable int id) {
        //television delete
        //return 204 response status
        return ResponseEntity.noContent().build();
    }
}
