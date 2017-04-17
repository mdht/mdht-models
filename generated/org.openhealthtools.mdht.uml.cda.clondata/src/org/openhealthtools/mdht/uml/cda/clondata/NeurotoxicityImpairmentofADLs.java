/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getNeurotoxicityImpairmentofADLs()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLs'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Neurotoxicity Impairment of ADLsTemplateId Neurotoxicity Impairment of ADLsEntryRelationship Neurotoxicity Impairment of ADLsEntryRelationshipObservationClassCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationCodeP Neurotoxicity Impairment of ADLsEntryRelationshipObservationCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationId Neurotoxicity Impairment of ADLsEntryRelationshipObservationMoodCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationStatusCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationValue Neurotoxicity Impairment of ADLsEntryRelationshipTypeCode Neurotoxicity Impairment of ADLsEntryRelationshipObservation' templateId.root='2.16.840.1.113883.10.20.30.3.37' constraints.validation.query='Neurotoxicity Impairment of ADLsEntryRelationshipObservationClassCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationCodeP Neurotoxicity Impairment of ADLsEntryRelationshipObservationCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationId Neurotoxicity Impairment of ADLsEntryRelationshipObservationMoodCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationStatusCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationValue Neurotoxicity Impairment of ADLsEntryRelationshipTypeCode Neurotoxicity Impairment of ADLsEntryRelationshipObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataNeurotoxicityImpairmentofADLsEntryRelationship constraints.validation.error='Neurotoxicity Impairment of ADLsEntryRelationshipTypeCode Neurotoxicity Impairment of ADLsEntryRelationshipObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/clondataNeurotoxicityImpairmentofADLsEntryRelationshipObservation classCode='OBS' constraints.validation.error='Neurotoxicity Impairment of ADLsEntryRelationshipObservationClassCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationCodeP Neurotoxicity Impairment of ADLsEntryRelationshipObservationId Neurotoxicity Impairment of ADLsEntryRelationshipObservationMoodCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationStatusCode Neurotoxicity Impairment of ADLsEntryRelationshipObservationValue' code.code='ASSERTION'"
 * @generated
 */
public interface NeurotoxicityImpairmentofADLs extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.30.3.37\')'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationship'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\'))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'moodCode\'))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationStatusCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservationValue'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.code = \'1946603\' and value.codeSystem = \'2.16.840.1.113883.6.96\')))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Neurotoxicity Impairment of ADLsEntryRelationshipObservation'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurotoxicityImpairmentofADLs init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurotoxicityImpairmentofADLs init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NeurotoxicityImpairmentofADLs
