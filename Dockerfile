FROM sonatype/nexus3:3.27.0
LABEL maintainer="Deven Phillips <deven.phillips@redhat.com>" \
      vendor="Red Hat" \
      description="Sonatype Nexus repository manager with Kubernetes/OpenShift Config plugin" \
      source="https://github.com/sonatype-nexus-community/nexus-kubernetes-openshift" \
      documentation="https://github.com/sonatype-nexus-community/nexus-kubernetes-openshift/blob/master/README.md"
ARG PLUGIN_VERSION=0.2.8

USER root
RUN curl -L https://github.com/sonatype-nexus-community/nexus-kubernetes-openshift/releases/download/v${PLUGIN_VERSION}/nexus-openshift-plugin-${PLUGIN_VERSION}.jar -o /opt/sonatype/nexus/deploy/nexus-openshift-plugin.jar
RUN chown root:root /opt -R \
    && chown root:root /nexus-data -R \
    && chmod 775 /opt -R \
    && chmod 775 /nexus-data -R
USER nexus
