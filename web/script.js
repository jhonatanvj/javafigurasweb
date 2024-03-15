document.getElementById('figura').addEventListener('change', function() {
        var figura = this.value;
        var trianguloInputs = document.getElementById('trianguloInputs');
        var cuadradoInputs = document.getElementById('cuadradoInputs');
        var trapecioInputs = document.getElementById('trapecioInputs');
        
        if (figura === 'triangulo') {
            trianguloInputs.style.display = 'block';
            cuadradoInputs.style.display = 'none';
            trapecioInputs.style.display = 'none';
        } else if (figura === 'cuadrado') {
            trianguloInputs.style.display = 'none';
            cuadradoInputs.style.display = 'block';
            trapecioInputs.style.display = 'none';
        } else if (figura === 'trapecio') {
            trianguloInputs.style.display = 'none';
            cuadradoInputs.style.display = 'none';
            trapecioInputs.style.display = 'block';
        } else {
            trianguloInputs.style.display = 'none';
            cuadradoInputs.style.display = 'none';
            trapecioInputs.style.display = 'none';
        }
        console.log("hola");
    });