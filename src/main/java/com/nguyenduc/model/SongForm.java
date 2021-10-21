package com.nguyenduc.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongForm {
    private Long id;

    @Size(max = 800, message = "Truong nay khong duoc nhap qua 800 ky tu")
    @NotEmpty(message = "Truong nay khong the bo trong")
    @Pattern(regexp = "^[a-zA-Z0-9aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵ._ ]*$",message = "Truong nay khong duoc nhap ky tu dac biet")
    private String name;
    @Size(max = 300, message = "Truong nay khong duoc nhap qua 300 ky tu")
    @NotEmpty(message = "Truong nay khong the bo trong")
    @Pattern(regexp = "^[a-zA-Z0-9aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵ._ ]*$",message = "Truong nay khong duoc nhap ky tu dac biet")
    private String singer;

    private MultipartFile link;

    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public MultipartFile getLink() {
        return link;
    }

    public void setLink(MultipartFile link) {
        this.link = link;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
