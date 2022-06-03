package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository // 데이터 저장하는 곳(Repository)
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
    // MemoryDbRepositoryAbstract 클래스의 <T> 는 WishListEntity 로 대체되어 동작



}
