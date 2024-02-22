package fr.epsi.b32324c2.tpspringboot;

import fr.epsi.b32324c2.tpspringboot.bo.*;
import fr.epsi.b32324c2.tpspringboot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TpSpringbootApplication implements CommandLineRunner {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private FishRepository fishRepository;

    @Autowired
    private PetStoreRepository petStoreRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create some address
        Address address1 = new Address();
        address1.setNumber("1");
        address1.setStreet("rue de la Paix");
        address1.setZipCode("75000");
        address1.setCity("Paris");

        Address address2 = new Address();
        address2.setNumber("2");
        address2.setStreet("rue de la Liberté");
        address2.setZipCode("69000");
        address2.setCity("Lyon");

        Address address3 = new Address();
        address3.setNumber("3");
        address3.setStreet("rue de la Fraternité");
        address3.setZipCode("13000");
        address3.setCity("Marseille");

        // create some pet store with address
        PetStore petStore1 = new PetStore();
        petStore1.setName("PetStore 1");
        petStore1.setManagerName("Manager 1");
        petStore1.setAddress(address1);

        PetStore petStore2 = new PetStore();
        petStore2.setName("PetStore 2");
        petStore2.setManagerName("Manager 2");
        petStore2.setAddress(address2);

        PetStore petStore3 = new PetStore();
        petStore3.setName("PetStore 3");
        petStore3.setManagerName("Manager 3");
        petStore3.setAddress(address3);

        // Save pet store with their address
        PetStore petStoreSave1 = petStoreRepository.save(petStore1);
        PetStore petStoreSave2 = petStoreRepository.save(petStore2);
        PetStore petStoreSave3 = petStoreRepository.save(petStore3);

        // create some animals
        Animal animal1 = new Animal();
        animal1.setBirth(java.time.LocalDate.now());
        animal1.setColor("Black");
        animal1.setPetStore(petStoreSave1);

        Animal animal2 = new Animal();
        animal2.setBirth(java.time.LocalDate.now());
        animal2.setColor("White");
        animal2.setPetStore(petStoreSave2);

        Animal animal3 = new Animal();
        animal3.setBirth(java.time.LocalDate.now());
        animal3.setColor("Brown");
        animal3.setPetStore(petStoreSave3);

        // Save animals
        animalRepository.save(animal1);
        animalRepository.save(animal2);
        animalRepository.save(animal3);

        // Create some cat
        Cat cat1 = new Cat();
        cat1.setBirth(java.time.LocalDate.now());
        cat1.setColor("Black");
        cat1.setPetStore(petStoreSave1);
        cat1.setChipId("123456789");

        Cat cat2 = new Cat();
        cat2.setBirth(java.time.LocalDate.now());
        cat2.setColor("White");
        cat2.setPetStore(petStoreSave2);
        cat2.setChipId("987654321");

        Cat cat3 = new Cat();
        cat3.setBirth(java.time.LocalDate.now());
        cat3.setColor("Brown");
        cat3.setPetStore(petStoreSave3);
        cat3.setChipId("456789123");

        // Save cats
        catRepository.save(cat1);
        catRepository.save(cat2);
        catRepository.save(cat3);

        // Create some fish
        Fish fish1 = new Fish();
        fish1.setBirth(java.time.LocalDate.now());
        fish1.setColor("Black");
        fish1.setPetStore(petStoreSave1);
        fish1.setLivingEnv(FishLiveEnv.FRESH_WATER);

        Fish fish2 = new Fish();
        fish2.setBirth(java.time.LocalDate.now());
        fish2.setColor("White");
        fish2.setPetStore(petStoreSave2);
        fish2.setLivingEnv(FishLiveEnv.SEA_WATER);

        Fish fish3 = new Fish();
        fish3.setBirth(java.time.LocalDate.now());
        fish3.setColor("Brown");
        fish3.setPetStore(petStoreSave3);
        fish3.setLivingEnv(FishLiveEnv.FRESH_WATER);

        // Save fish
        fishRepository.save(fish1);
        fishRepository.save(fish2);
        fishRepository.save(fish3);

        // Create some product
        Product product1 = new Product();
        product1.setCode("123456");
        product1.setType(ProdType.ACCESSORY);
        product1.setLabel("Accessory 1");
        product1.setPrice(10.0);
        product1.setPetStores(List.of(petStoreSave1, petStoreSave2));

        Product product2 = new Product();
        product2.setCode("654321");
        product2.setType(ProdType.FOOD);
        product2.setLabel("Food 1");
        product2.setPrice(5.0);
        product2.setPetStores(List.of(petStoreSave2, petStoreSave3));

        Product product3 = new Product();
        product3.setCode("456789");
        product3.setType(ProdType.ACCESSORY);
        product3.setLabel("Accessory 2");
        product3.setPrice(15.0);
        product3.setPetStores(List.of(petStoreSave1, petStoreSave3));

        // Save product
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        // Find all pet in pet store
        Long petStoreSaveId = petStoreSave1.getId();
        List<Animal> animals = animalRepository.findByPetStoreId(petStoreSaveId);
        System.out.println("Animals of " + petStoreSave1.getName() + ": " + animals);
    }
}
