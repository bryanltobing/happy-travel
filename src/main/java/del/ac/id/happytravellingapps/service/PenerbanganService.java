package del.ac.id.happytravellingapps.service;

import java.util.List;

import del.ac.id.happytravellingapps.model.Penerbangan;
import del.ac.id.happytravellingapps.repository.PenerbanganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PenerbanganService {

    @Autowired
    private PenerbanganRepository repository;

    public List<Penerbangan> listAll(){

        return repository.findAll();
    }

    public void create(Penerbangan penerbangan) {

        repository.save(penerbangan);
    }

    public Penerbangan updateid(Long id) {

        return repository.findById(id).get();
    }

    public void delete(Long id) {

        repository.deleteById(id);
    }

}