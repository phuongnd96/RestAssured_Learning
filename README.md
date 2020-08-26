>### RestAssured_Learning
>--------
>#### Demo api call and assertion with rest assured
>API Endpoint: 

```
http://35.189.151.113:3000/product?page=${page}&limit=${limit}&productName${productName}=&minPrice${minPrice}=&maxPrice=${maxPrice}&productType=${productType}
```
>>### Request queries
>- page
>- limit
>- productName
>- minPrice
>- maxPrice
>- productType
>>### Response
>#### Code 200
>```
> [{"ratings":[null],"_id":"5f3785887a39eb49f8abefdf","productName":"oppo f1s","productType":"dien thoai","price":20010200,"inStock":-1,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597474183617.jpg","__v":0,"link":"/assets/main?productName=oppo f1s"}
> ,{"ratings":[null],"_id":"5f3785ba7a39eb268eabefe1","productName":"iphone 7 plus","productType":"dien thoai","price":20010200,"inStock":0,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597474234089.jpg","__v":0,"link":"/assets/main?productName=iphone 7 plus"}
> ,{"ratings":[null],"_id":"5f378e397a39eb5d14abefe8","productName":"iphone 6 plus","productType":"dien thoai","price":20010200,"inStock":1,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597476408626.jpg","__v":0,"link":"/assets/main?productName=iphone 6 plus"}
> ,{"ratings":[null],"_id":"5f378e3d7a39ebcb90abefe9","productName":"iphone 8 plus","productType":"dien thoai","price":20010200,"inStock":0,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597476413104.jpg","__v":0,"link":"/assets/main?productName=iphone 8 plus"}
> ,{"ratings":[null],"_id":"5f378e3f7a39eb76bfabefea","productName":"iphone 9 plus","productType":"dien thoai","price":20010200,"inStock":1,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597476415089.jpg","__v":0,"link":"/assets/main?productName=iphone 9 plus"}
> ,{"ratings":[null],"_id":"5f378e427a39eba49dabefeb","productName":"iphone 10 plus","productType":"dien thoai","price":20010200,"inStock":1,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597476418107.jpg","__v":0,"link":"/assets/main?productName=iphone 10 plus"}
> ,{"ratings":[null],"_id":"5f378e447a39eb26f8abefec","productName":"iphone 11 plus","productType":"dien thoai","price":20010200,"inStock":1,"description":"testdescription","averageRating":null,"mainImgPath":"/node_server/storage/main/main1597476420145.jpg","__v":0,"link":"/assets/main?productName=iphone 11 plus"}]
>```

>API Endpoint: 

>```
http://35.189.151.113:3000/payment
>```

>```
>>### Request body
>- address :""
>- email   :"" 
>- name     :"test"
>- phone    :""
>- products :null
>```

>>### Response
>#### Code 400
>```
phone is required
```
