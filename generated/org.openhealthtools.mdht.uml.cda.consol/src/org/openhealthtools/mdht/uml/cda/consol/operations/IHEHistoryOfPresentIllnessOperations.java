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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IHE History Of Present Illness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness#validateIHEHistoryOfPresentIllnessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness#validateIHEHistoryOfPresentIllnessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IHEHistoryOfPresentIllnessOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHEHistoryOfPresentIllnessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEHistoryOfPresentIllnessTemplateId(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEHistoryOfPresentIllnessTemplateId(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEHistoryOfPresentIllnessTemplateId(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEHistoryOfPresentIllnessTemplateId(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.4')
	 * @param iheHistoryOfPresentIllness The receiving '<em><b>IHE History Of Present Illness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEHistoryOfPresentIllnessTemplateId(
			IHEHistoryOfPresentIllness iheHistoryOfPresentIllness, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IHE_HISTORY_OF_PRESENT_ILLNESS);
			try {
				VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			iheHistoryOfPresentIllness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IHE_HISTORY_OF_PRESENT_ILLNESS__IHE_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("IHEHistoryOfPresentIllnessTemplateId"),
					new Object[] { iheHistoryOfPresentIllness }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEHistoryOfPresentIllnessCode(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEHistoryOfPresentIllnessCode(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '10164-2' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEHistoryOfPresentIllnessCode(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE History Of Present Illness Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEHistoryOfPresentIllnessCode(IHEHistoryOfPresentIllness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10164-2' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param iheHistoryOfPresentIllness The receiving '<em><b>IHE History Of Present Illness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEHistoryOfPresentIllnessCode(IHEHistoryOfPresentIllness iheHistoryOfPresentIllness,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IHE_HISTORY_OF_PRESENT_ILLNESS);
			try {
				VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_HISTORY_OF_PRESENT_ILLNESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			iheHistoryOfPresentIllness)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.IHE_HISTORY_OF_PRESENT_ILLNESS__IHE_HISTORY_OF_PRESENT_ILLNESS_CODE,
					ConsolPlugin.INSTANCE.getString("IHEHistoryOfPresentIllnessCode"),
					new Object[] { iheHistoryOfPresentIllness }));
			}
			return false;
		}
		return true;
	}

} // IHEHistoryOfPresentIllnessOperations
