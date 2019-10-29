job('NodeJS example') {
    scm {
        git('git://github.com/snukala417/jenkins.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('snukala417')
            node / gitConfigEmail('snukala417@yahoo.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("python Testmath.py")
    }
}
