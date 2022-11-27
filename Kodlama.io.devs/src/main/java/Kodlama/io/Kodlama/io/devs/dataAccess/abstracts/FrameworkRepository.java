package Kodlama.io.Kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Kodlama.io.devs.entities.concretes.ProgramingLanguageFramework;

public interface FrameworkRepository extends JpaRepository<ProgramingLanguageFramework, Integer> {

}
