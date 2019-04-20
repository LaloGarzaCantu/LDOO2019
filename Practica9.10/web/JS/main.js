window.addEventListener('load',function(){
    
    document.getElementById('btniniciar').addEventListener('click',function(){
        var nombre= document.getElementById('txtusuario').value;
        var contraseña= document.getElementById('txtpass').value;
        var bandera= false;
        
        if(nombre.length > 0&& contraseña.length>0){
            bandera=true;
            
        }
        if(bandera){
            document.getElementById('forminicio').submit();
            
        }else{
            
            alert('Rellene todos los campos ');
        }
    
    });
});


