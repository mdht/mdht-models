/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getVitalSignsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='EMSPCRVitalSignsOrganizerSystolicBloodPressureComponent EMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent EMSPCRVitalSignsOrganizerHeartRateComponent EMSPCRVitalSignsOrganizerRespiratoryRateComponent EMSPCRVitalSignsOrganizerBodyTemperatureComponent EMSPCRVitalSignsOrganizerOxygenSaturationComponent' constraints.validation.error='EMSPCRVitalSignsOrganizerTemplateId EMSPCRVitalSignsOrganizerEffectiveTime' templateId.root='2.16.840.1.1133883.17.3.10.1.28'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerSystolicBloodPressureComponent constraints.validation.error='VitalSignsOrganizerSystolicBloodPressureComponentSystolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerDiastolicBloodPressureComponent constraints.validation.error='VitalSignsOrganizerDiastolicBloodPressureComponentDiastolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerHeartRateComponent constraints.validation.error='VitalSignsOrganizerHeartRateComponentHeartRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerRespiratoryRateComponent constraints.validation.error='VitalSignsOrganizerRespiratoryRateComponentRespiratoryRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerBodyTemperatureComponent constraints.validation.error='VitalSignsOrganizerBodyTemperatureComponentBodyTemperature'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerOxygenSaturationComponent constraints.validation.error='VitalSignsOrganizerOxygenSaturationComponentOxygenSaturation'"
 * @generated
 */
public interface VitalSignsOrganizer extends org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerHeartRateComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateEMSPCRVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsOrganizer
