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
import io.kubernetes.client.openapi.models.AppsV1beta1DeploymentCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 */
@ApiModel(description = "DeploymentStatus is the most recently observed status of the Deployment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class AppsV1beta1DeploymentStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";
  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<AppsV1beta1DeploymentCondition> conditions = null;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";
  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";
  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_UNAVAILABLE_REPLICAS = "unavailableReplicas";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_REPLICAS)
  private Integer unavailableReplicas;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";
  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;


  public AppsV1beta1DeploymentStatus availableReplicas(Integer availableReplicas) {
    
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
   * @return availableReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.")

  public Integer getAvailableReplicas() {
    return availableReplicas;
  }


  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }


  public AppsV1beta1DeploymentStatus collisionCount(Integer collisionCount) {
    
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   * @return collisionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.")

  public Integer getCollisionCount() {
    return collisionCount;
  }


  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }


  public AppsV1beta1DeploymentStatus conditions(List<AppsV1beta1DeploymentCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public AppsV1beta1DeploymentStatus addConditionsItem(AppsV1beta1DeploymentCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<AppsV1beta1DeploymentCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a deployment&#39;s current state.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the latest available observations of a deployment's current state.")

  public List<AppsV1beta1DeploymentCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<AppsV1beta1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }


  public AppsV1beta1DeploymentStatus observedGeneration(Long observedGeneration) {
    
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The generation observed by the deployment controller.
   * @return observedGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The generation observed by the deployment controller.")

  public Long getObservedGeneration() {
    return observedGeneration;
  }


  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  public AppsV1beta1DeploymentStatus readyReplicas(Integer readyReplicas) {
    
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * Total number of ready pods targeted by this deployment.
   * @return readyReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of ready pods targeted by this deployment.")

  public Integer getReadyReplicas() {
    return readyReplicas;
  }


  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }


  public AppsV1beta1DeploymentStatus replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment (their labels match the selector).")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public AppsV1beta1DeploymentStatus unavailableReplicas(Integer unavailableReplicas) {
    
    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

   /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   * @return unavailableReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.")

  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }


  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }


  public AppsV1beta1DeploymentStatus updatedReplicas(Integer updatedReplicas) {
    
    this.updatedReplicas = updatedReplicas;
    return this;
  }

   /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
   * @return updatedReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment that have the desired template spec.")

  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }


  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
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
    sb.append("class AppsV1beta1DeploymentStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ").append(toIndentedString(unavailableReplicas)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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

