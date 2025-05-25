document.querySelector('button').addEventListener('click',function(){

 const API="https://restcountries.com/v3.1/all";
 var xhr=new XMLHttpRequest();
  console.log(xhr);
  console.log(xhr.readyState, xhr.status);
  xhr.onreadystatechange=function()
  {
    console.log(xhr.readyState, xhr.status);
    if(xhr.readyState == 4 && xhr.status == 200)
        {
        var result=xhr.responseText
        console.log(result)
        var record=JSON.parse(result);
        console.log(record);
        
        record.forEach(function (value,j)
        {
             console.log(value);
             console.log(value.flags.png, value.name.common);
             var divTag=document.createElement("div");
             console.log(divTag);

              divTag.className="col-xl-3 text-center";
               var imgTag=document.createElement("img");
               var pTag=document.createElement("p");
               imgTag.src=value.flags.png;
               pTag.innerText=value.name.common;

                divTag.append(imgTag,pTag);
             document.querySelector(".row").append(divTag);

        });

    }

  };
  xhr.open('get',API);
  xhr.send();

});