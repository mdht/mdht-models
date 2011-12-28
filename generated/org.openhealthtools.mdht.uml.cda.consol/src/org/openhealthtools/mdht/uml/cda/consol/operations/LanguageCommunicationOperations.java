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
import org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Language Communication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication#validateConsolLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication#validateConsolLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Mode Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageCommunicationOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageCommunicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolLanguageCommunicationPreferenceInd(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Preference Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolLanguageCommunicationPreferenceInd(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.preferenceInd.oclIsUndefined() or self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolLanguageCommunicationPreferenceInd(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Preference Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolLanguageCommunicationPreferenceInd(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.preferenceInd.oclIsUndefined() or self.preferenceInd.isNullFlavorUndefined()) implies (not self.preferenceInd.oclIsUndefined())
	 * @param languageCommunication The receiving '<em><b>Language Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolLanguageCommunicationPreferenceInd(LanguageCommunication languageCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LANGUAGE_COMMUNICATION);
			try {
				VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			languageCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.LANGUAGE_COMMUNICATION__CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND,
					ConsolPlugin.INSTANCE.getString("ConsolLanguageCommunicationPreferenceInd"),
					new Object[] { languageCommunication }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolLanguageCommunicationModeCode(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Mode Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolLanguageCommunicationModeCode(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolLanguageCommunicationModeCode(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Mode Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolLanguageCommunicationModeCode(LanguageCommunication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))
	 * @param languageCommunication The receiving '<em><b>Language Communication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolLanguageCommunicationModeCode(LanguageCommunication languageCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LANGUAGE_COMMUNICATION);
			try {
				VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			languageCommunication)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.LANGUAGE_COMMUNICATION__CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE,
					ConsolPlugin.INSTANCE.getString("ConsolLanguageCommunicationModeCode"),
					new Object[] { languageCommunication }));
			}
			return false;
		}
		return true;
	}

} // LanguageCommunicationOperations
