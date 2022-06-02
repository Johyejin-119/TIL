package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {
    // CRUD

    @Autowired
    private WishListRepository wishListRepository;

    private WishListEntity create() {
        var wishList = new WishListEntity();
        wishList.setTitle("title");
        wishList.setCategory("category");
        wishList.setAddress("address");
        wishList.setReadAddress("readAddress");
        wishList.setHomePageLink("");
        wishList.setImageLink("");
        wishList.setVisit(false);
        wishList.setVisitCount(0);
        wishList.setLastVisitDate(null);

        return wishList;
    }

    @Test
    public void saveTest() { // 데이터 handling 테스트
        var wishListEntity = create();
        var expected = wishListRepository.save(wishListEntity);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex()); // 데이터의 index 값은 1
    }

    @Test
    public void updateTest() { // 데이터 변경 테스트
        var wishListEntity = create();
        var expected = wishListRepository.save(wishListEntity);

        // 데이터가 이미 있는 경우
        expected.setTitle("update test");
        var saveEntity = wishListRepository.save(expected);

        Assertions.assertEquals("update test", saveEntity.getTitle()); // getTitle() 은 동일해야 함
        Assertions.assertEquals(1, wishListRepository.ListAll().size()); // size 는 1이여야함 -> 덮어쓰기

    }

    @Test
    public void findByIdTest() { // 특정 index 값으로 데이터 찾는 테스트
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);

        var expected = wishListRepository.findById(1); // 1번 값 찾기

        Assertions.assertEquals(true, expected.isPresent()); // 값이 있어야함
        Assertions.assertEquals(1, expected.get().getIndex()); // 데이터의 index 값은 1

    }

    @Test
    public void deleteTest() { // 데이터 삭제 테스트
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);
        wishListRepository.deleteById(1); // 1번 값 삭제

        int count = wishListRepository.ListAll().size();

        Assertions.assertEquals(0, count); // 데이터 하나 넣은 후 삭제했으므로 size 는 0 이여야 함

    }

    @Test
    public void listAllTest() { // 데이터 전체 테스트
        var wishListEntity1 = create();
        wishListRepository.save(wishListEntity1);

        var wishListEntity2 = create();
        wishListRepository.save(wishListEntity2);

        int count = wishListRepository.ListAll().size();
        Assertions.assertEquals(2, count); // size 는 2 이여야 함
    }

}
