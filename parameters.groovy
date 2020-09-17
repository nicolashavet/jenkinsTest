def fileContents = readFile 'C:\\jenkinsConfiguration\\test.json'
def jsonObj = readJSON text: fileContents

return jsonObj.name


//  return(["alice","bob"])