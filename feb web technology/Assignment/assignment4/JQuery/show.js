$(document).ready(function () {
    $("button").click(function () 
    {
     $.ajax({

        type:'get',
        url:'http://localhost:9000/team/all',
        success:function(result){
            console.log(result)
            result.forEach(function(value){
            console.log(value);
            $('tbody').append(`
                <tr>
                <td>${value.name}</td>
                 <td>${value.owner}</td>
                 <td>${value.coach}</td>

                </tr>

                `)
            })
        },

        error:function(result)
        {
            console.log(result);
        },
        
     });
      
    });
  });