

# V2beta1HorizontalPodAutoscaler

HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which automatically manages the replica count of any resource implementing the scale subresource based on the metrics specified.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**spec** | [**V2beta1HorizontalPodAutoscalerSpec**](V2beta1HorizontalPodAutoscalerSpec.md) |  |  [optional]
**status** | [**V2beta1HorizontalPodAutoscalerStatus**](V2beta1HorizontalPodAutoscalerStatus.md) |  |  [optional]



