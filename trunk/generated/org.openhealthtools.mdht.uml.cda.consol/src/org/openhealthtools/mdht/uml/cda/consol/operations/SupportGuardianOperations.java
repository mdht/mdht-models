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
import org.openhealthtools.mdht.uml.cda.consol.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.GuardianOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Support Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian#validateSupportGuardianTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian#validateSupportGuardianClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian#validateSupportGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian#validateSupportGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportGuardian#validateSupportGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportGuardianOperations extends GuardianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportGuardianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportGuardianTemplateId(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianTemplateId(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportGuardianTemplateId(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianTemplateId(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.3')
	 * @param supportGuardian The receiving '<em><b>Support Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupportGuardianTemplateId(SupportGuardian supportGuardian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_GUARDIAN);
			try {
				VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supportGuardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUPPORT_GUARDIAN__SUPPORT_GUARDIAN_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SupportGuardianTemplateId"), new Object[] { supportGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportGuardianClassCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianClassCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::RoleClass::GUAR";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportGuardianClassCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianClassCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode') and self.classCode=vocab::RoleClass::GUAR
	 * @param supportGuardian The receiving '<em><b>Support Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupportGuardianClassCode(SupportGuardian supportGuardian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_GUARDIAN);
			try {
				VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supportGuardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUPPORT_GUARDIAN__SUPPORT_GUARDIAN_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("SupportGuardianClassCode"), new Object[] { supportGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportGuardianCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportGuardianCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianCode(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111'))
	 * @param supportGuardian The receiving '<em><b>Support Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupportGuardianCode(SupportGuardian supportGuardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_GUARDIAN);
			try {
				VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supportGuardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUPPORT_GUARDIAN__SUPPORT_GUARDIAN_CODE,
					ConsolPlugin.INSTANCE.getString("SupportGuardianCode"), new Object[] { supportGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportGuardianAddr(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianAddr(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportGuardianAddr(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianAddr(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param supportGuardian The receiving '<em><b>Support Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupportGuardianAddr(SupportGuardian supportGuardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_GUARDIAN);
			try {
				VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supportGuardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUPPORT_GUARDIAN__SUPPORT_GUARDIAN_ADDR,
					ConsolPlugin.INSTANCE.getString("SupportGuardianAddr"), new Object[] { supportGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportGuardianTelecom(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianTelecom(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportGuardianTelecom(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportGuardianTelecom(SupportGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param supportGuardian The receiving '<em><b>Support Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSupportGuardianTelecom(SupportGuardian supportGuardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_GUARDIAN);
			try {
				VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			supportGuardian)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SUPPORT_GUARDIAN__SUPPORT_GUARDIAN_TELECOM,
					ConsolPlugin.INSTANCE.getString("SupportGuardianTelecom"), new Object[] { supportGuardian }));
			}
			return false;
		}
		return true;
	}

} // SupportGuardianOperations
