/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Performer1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physician Reading Study Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianReadingStudyPerformer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianReadingStudyPerformerTemplateId PhysicianReadingStudyPerformerTypeCode PhysicianReadingStudyPerformerAssignedEntity PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityId PhysicianReadingStudyPerformerAssignedEntityCode' templateId.root='2.16.840.1.113883.10.20.6.2.1' constraints.validation.info='PhysicianReadingStudyPerformerTime PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS' typeCode='PRF' constraints.validation.query='PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId PhysicianReadingStudyPerformerAssignedEntityId PhysicianReadingStudyPerformerAssignedEntityCode' constraints.validation.warning='PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS PhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPhysicianReadingStudyPerformerAssignedEntity constraints.validation.error='PhysicianReadingStudyPerformerAssignedEntityHasDICOM PhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization PhysicianReadingStudyPerformerAssignedEntityId PhysicianReadingStudyPerformerAssignedEntityCode' constraints.validation.warning='PhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId'"
 * @generated
 */
public interface PhysicianReadingStudyPerformer extends Performer1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.1\')'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::x_ServiceEventPerformer::PRF'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 8))))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 12))))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 14))))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject((not value.oclIsUndefined() and value.size() &gt; 8 implies value.size() &gt;= 15) and ((not low.value.oclIsUndefined() and low.value.size() &gt; 8 implies low.value.size() &gt;= 15) and (not high.value.oclIsUndefined() and high.value.size() &gt; 8 implies high.value.size() &gt;= 15)))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(code.codeSystem = \'1.2.840.10008.2.16.4\' or code.codeSystem = \'2.16.840.1.113883.6.101\')'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(not assignedPerson-&gt;isEmpty() or  not representedOrganization-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject(id-&gt;exists( root=\'2.16.840.1.113883.4.6\' ))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianReadingStudyPerformer
