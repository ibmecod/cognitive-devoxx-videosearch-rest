function load()
{
	var data = new FormData();
	data.append("file", $("#file")[0].files[0]);

	$.ajax
	(
			{
				timeout: 3000,
				type: "POST",
				url: "ProcessAudioFile",
				datatype: "json",
				cache: false,
			    contentType: false,
			    processData: false,
			    enctype: "multipart/form-data",
			    data: data,
				success: function(data)
				{
					alert(data);
					
				},
				error: function()
				{
					alert("error");
					
				},
			}
	);
	
}

////utilities
//function createXHR(){
//	if(typeof XMLHttpRequest != 'undefined'){
//		return new XMLHttpRequest();
//	}else{
//		try{
//			return new ActiveXObject('Msxml2.XMLHTTP');
//		}catch(e){
//			try{
//				return new ActiveXObject('Microsoft.XMLHTTP');
//			}catch(e){}
//		}
//	}
//	return null;
//}
//function xhrGet(url, callback, errback){
//	var xhr = new createXHR();
//	xhr.open("GET", url, true);
//	xhr.onreadystatechange = function(){
//		if(xhr.readyState == 4){
//			if(xhr.status == 200){
//				callback(xhr.responseText);
//			}else{
//				errback('service not available');
//			}
//		}
//	};
//	xhr.timeout = 3000;
//	xhr.ontimeout = errback;
//	xhr.send();
//}
//function parseJson(str){
//	return window.JSON ? JSON.parse(str) : eval('(' + str + ')');
//}
//function prettyJson(str){
//	// If browser does not have JSON utilities, just print the raw string value.
//	return window.JSON ? JSON.stringify(JSON.parse(str), null, '  ') : str;
//}
//
