/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Medicinal Supply Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getNonMedicinalSupplyActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='NonMedicinalSupplyActivity2TemplateId NonMedicinalSupplyActivity2Instruction2InversionInd NonMedicinalSupplyActivityStatusCode NonMedicinalSupplyActivityStatusCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.50' templateId.extension='2014-06-09' constraints.validation.dependOn.NonMedicinalSupplyActivityStatusCode='NonMedicinalSupplyActivityStatusCodeP' constraints.validation.info='NonMedicinalSupplyActivity2Instruction2 NonMedicinalSupplyActivityProductInstance'"
 * @generated
 */
public interface NonMedicinalSupplyActivity2 extends NonMedicinalSupplyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))-&gt;forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateNonMedicinalSupplyActivity2Instruction2InversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.50\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateNonMedicinalSupplyActivity2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateNonMedicinalSupplyActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateNonMedicinalSupplyActivity2Instruction2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	Instruction2 getInstruction2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getParticipantRoles()-&gt;select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::ProductInstance))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProductInstance)'"
	 * @generated
	 */
	ProductInstance getConsolProductInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NonMedicinalSupplyActivity2
