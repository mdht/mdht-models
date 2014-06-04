/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#getInstruction2() <em>Get Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonMedicinalSupplyActivity2Operations extends NonMedicinalSupplyActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMedicinalSupplyActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivity2Instruction2InversionInd(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivity2Instruction2InversionInd(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instruction2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivity2Instruction2InversionInd(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivity2Instruction2InversionInd(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonMedicinalSupplyActivity2 The receiving '<em><b>Non Medicinal Supply Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonMedicinalSupplyActivity2Instruction2InversionInd(
			NonMedicinalSupplyActivity2 nonMedicinalSupplyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY2__NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivity2Instruction2InversionInd"),
					new Object[] { nonMedicinalSupplyActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivity2Instruction2(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivity2Instruction2(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivity2Instruction2(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivity2Instruction2(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonMedicinalSupplyActivity2 The receiving '<em><b>Non Medicinal Supply Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonMedicinalSupplyActivity2Instruction2(
			NonMedicinalSupplyActivity2 nonMedicinalSupplyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY2__NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivity2Instruction2"),
					new Object[] { nonMedicinalSupplyActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2(NonMedicinalSupplyActivity2) <em>Get Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2(NonMedicinalSupplyActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))->asSequence()->any(true).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2(NonMedicinalSupplyActivity2) <em>Get Instruction2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2(NonMedicinalSupplyActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Instruction2 getInstruction2(NonMedicinalSupplyActivity2 nonMedicinalSupplyActivity2) {
		if (GET_INSTRUCTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2,
				ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2.getEAllOperations().get(65));
			try {
				GET_INSTRUCTION2__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTION2__EOCL_QRY);
		return (Instruction2) query.evaluate(nonMedicinalSupplyActivity2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.50.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonMedicinalSupplyActivityTemplateId(NonMedicinalSupplyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonMedicinalSupplyActivity2 The receiving '<em><b>Non Medicinal Supply Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonMedicinalSupplyActivityTemplateId(
			NonMedicinalSupplyActivity2 nonMedicinalSupplyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2);
			try {
				VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			nonMedicinalSupplyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.NON_MEDICINAL_SUPPLY_ACTIVITY2__NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("NonMedicinalSupplyActivityTemplateId"),
					new Object[] { nonMedicinalSupplyActivity2 }));
			}

			return false;
		}
		return true;
	}

} // NonMedicinalSupplyActivity2Operations
