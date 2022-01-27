#!/usr/bin/env groovy
//var SCMCheckout.groovy

def call(credentialsId, repourl, branchtag)
{ 
    checkout([$class: 'GITSCM', 
               branches: [name: "${branchtag}"]],
               doGenerateSubmoduleConfigurations: false,
               extensions: [],
               gitTool: 'Default',
               submoduleCfg: [],
               userRemoteConfigs: [[url:  "${repourl}", credentialsId: "${credentialsID}"]]
         ])

}
return this
