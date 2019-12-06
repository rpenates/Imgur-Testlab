package com.rpenates.imgurtestlab.data.repository

import com.rpenates.imgurtestlab.data.dao.PhotoDao
import com.rpenates.imgurtestlab.data.models.Photo
import com.rpenates.imgurtestlab.network.api.ImgurApi

class PhotoRepository private  constructor(
    private val photoDao: PhotoDao,
    private val imgurApi: ImgurApi
) {

    fun getPhoto(photoId: String) = photoDao.getPhoto(photoId)

    fun getPhotosByAlbum(albumId: String) = photoDao.getPhotosByAlbum(albumId)

    fun savePhoto(photo: Photo) = photoDao.savePhoto(photo)

    fun deletePhoto(photo: Photo) = photoDao.deletePhoto(photo)

}