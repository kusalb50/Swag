package com.kusalbandara.swag.Services

import com.kusalbandara.swag.Model.Category
import com.kusalbandara.swag.Model.Product

object DataService {
    val categories= listOf(Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitialgoodsimage")
    )
    val hats= listOf(Product("Devslopes Graphic Beanie","hat01","$11"),
        Product("Devslopes Hat Black","hat02","$12"),
        Product("Devslopes Hat White","hat03","$13"),
        Product("Devslopes SnapBack","hat04","$14"))
    val hoodies= listOf(Product("Devslopes Hoddie Gray","hoodie01","$18"),
        Product("Devslopes Hoddie Red","hoodie02","$21"),
        Product("Devslopes Gray Hoddie","hoodie03","$19"),
        Product("Devslopes Black Hoddie","hoodie04","$20"))

    val shirts= listOf(Product("Devslopes Shirt Black","shirt01","$18"),
        Product("Devslopes Badge Light Gray","shirt02","$17"),
        Product("Devslopes Logo Shirt Red","shirt03","$19"),
        Product("Devslopes Hustle","shirt04","$15"),
        Product("KickFlip Studios","shirt05","$18.60"))
}