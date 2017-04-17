/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Activity Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getProcedureActivityAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityActTemplateId HPOCProcedureActivityActText ProcedureActivityActCode' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.19' constraints.validation.info='HPOCProcedureActivityActEntryRelationshipEncounter HPOCProcedureActivityActEntryRelationshipInstructions HPOCProcedureActivityActEntryRelationshipIndication HPOCProcedureActivityActEntryRelationshipMedication HPOCProcedureActivityActEntryRelationshipProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounter typeCode='COMP' constraints.validation.error='ProcedureActivityActEntryRelationshipTypeCode ProcedureActivityActEntryRelationshipInversionInd' inversionInd='true'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipEncounterEncounter classCode='ENC' constraints.validation.error='ProcedureActivityActEntryRelationshipEncounterEncounterClassCode ProcedureActivityActEntryRelationshipEncounterEncounterClassCodeP ProcedureActivityActEntryRelationshipEncounterEncounterMoodCode ProcedureActivityActEntryRelationshipEncounterEncounterMoodCodeP ProcedureActivityActEntryRelationshipEncounterEncounterId' constraints.validation.dependOn.ProcedureActivityActEntryRelationshipEncounterEncounterClassCode='ProcedureActivityActEntryRelationshipEncounterEncounterClassCodeP' moodCode='EVN' constraints.validation.dependOn.ProcedureActivityActEntryRelationshipEncounterEncounterMoodCode='ProcedureActivityActEntryRelationshipEncounterEncounterMoodCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipInstructions typeCode='SUBJ' constraints.validation.error='ProcedureActivityActEntryRelationshipTypeCode ProcedureActivityActEntryRelationshipInversionInd' inversionInd='true'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipIndication typeCode='RSON' constraints.validation.error='ProcedureActivityActEntryRelationshipTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipMedication typeCode='COMP' constraints.validation.error='ProcedureActivityActEntryRelationshipTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocProcedureActivityActEntryRelationshipProcedure typeCode='COMP' constraints.validation.error='ProcedureActivityActEntryRelationshipTypeCode'"
 * @generated
 */
public interface ProcedureActivityAct extends EObject
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.19\')'"
	 * @generated
	 */
	boolean validateProcedureActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActText(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityActCode(DiagnosticChain diagnostics, Map<Object, Object> context);
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActEntryRelationshipEncounter(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActEntryRelationshipInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActEntryRelationshipIndication(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActEntryRelationshipMedication(DiagnosticChain diagnostics, Map<Object, Object> context);
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
  boolean validateHPOCProcedureActivityActEntryRelationshipProcedure(DiagnosticChain diagnostics, Map<Object, Object> context);
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct init();
		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityAct
