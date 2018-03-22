$(document).ready(function(){
	
	$("#formAdiciona").validate({
		
		rules: {
			descricao:{
				required: true,
				maxlength: 70
			}
		},
			
		messages:{
			descricao:{
				required: "Campo obrigatorio!",
				maxlength: "Limite de 70 caracteres estourado!"
			}
		}
		
	});
	
	$("#formAltera").validate({
		
		rules: {
			descricao: {
				required: true,
				maxlength: 70
			}
		},
		
		messages:{
			descricao:{
				required: "Campo obrigatorio!",
				maxlength: "Limite de 70 caracteres estourado!"
			}
		}
	
	});
	
	
});