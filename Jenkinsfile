pipeline {
    agent any
    parameters {
        extendedChoice( 
        defaultValue: '',
        description: 'Select one', 
        multiSelectDelimiter: ',', 
        name: 'SAMPLE_EXTENDED_CHOICE', 
        quoteValue: false, 
        saveJSONParameterToFile: false, 
        type: 'PT_SINGLE_SELECT', 
        //groovyScript: 'return(["alice","bob"])',
        groovyScriptFile: 'parameters.groovy',
        visibleItemCount: 10)
    }

    stages {
        stage('Hello') {
            steps {
                script{
                    println SAMPLE_EXTENDED_CHOICE
                }
            }
        }
    }
}
