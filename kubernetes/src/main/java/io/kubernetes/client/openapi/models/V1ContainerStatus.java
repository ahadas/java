/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ContainerState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerStatus contains details for the current status of this container.
 */
@ApiModel(description = "ContainerStatus contains details for the current status of this container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1ContainerStatus {
  public static final String SERIALIZED_NAME_CONTAINER_I_D = "containerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "imageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_LAST_STATE = "lastState";
  @SerializedName(SERIALIZED_NAME_LAST_STATE)
  private V1ContainerState lastState;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_RESTART_COUNT = "restartCount";
  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Integer restartCount;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private V1ContainerState state;


  public V1ContainerStatus containerID(String containerID) {
    
    this.containerID = containerID;
    return this;
  }

   /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
   * @return containerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'.")

  public String getContainerID() {
    return containerID;
  }


  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }


  public V1ContainerStatus image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
   * @return image
  **/
  @ApiModelProperty(required = true, value = "The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1ContainerStatus imageID(String imageID) {
    
    this.imageID = imageID;
    return this;
  }

   /**
   * ImageID of the container&#39;s image.
   * @return imageID
  **/
  @ApiModelProperty(required = true, value = "ImageID of the container's image.")

  public String getImageID() {
    return imageID;
  }


  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public V1ContainerStatus lastState(V1ContainerState lastState) {
    
    this.lastState = lastState;
    return this;
  }

   /**
   * Get lastState
   * @return lastState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ContainerState getLastState() {
    return lastState;
  }


  public void setLastState(V1ContainerState lastState) {
    this.lastState = lastState;
  }


  public V1ContainerStatus name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ContainerStatus ready(Boolean ready) {
    
    this.ready = ready;
    return this;
  }

   /**
   * Specifies whether the container has passed its readiness probe.
   * @return ready
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the container has passed its readiness probe.")

  public Boolean getReady() {
    return ready;
  }


  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  public V1ContainerStatus restartCount(Integer restartCount) {
    
    this.restartCount = restartCount;
    return this;
  }

   /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
   * @return restartCount
  **/
  @ApiModelProperty(required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.")

  public Integer getRestartCount() {
    return restartCount;
  }


  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }


  public V1ContainerStatus state(V1ContainerState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ContainerState getState() {
    return state;
  }


  public void setState(V1ContainerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStatus {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

