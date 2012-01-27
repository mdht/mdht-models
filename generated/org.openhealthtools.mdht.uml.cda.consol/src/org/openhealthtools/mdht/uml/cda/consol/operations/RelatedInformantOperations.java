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
import org.openhealthtools.mdht.uml.cda.consol.RelatedInformant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Related Informant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedInformant#validateRelatedInformantAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedInformant#validateRelatedInformantCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedInformantOperations extends RoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedInformantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedInformantAddr(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedInformantAddr(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedInformantAddr(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedInformantAddr(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param relatedInformant The receiving '<em><b>Related Informant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRelatedInformantAddr(RelatedInformant relatedInformant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_INFORMANT);
			try {
				VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RELATED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			relatedInformant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RELATED_INFORMANT__RELATED_INFORMANT_ADDR,
					ConsolPlugin.INSTANCE.getString("RelatedInformantAddr"), new Object[] { relatedInformant }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedInformantCode(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedInformantCode(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedInformantCode(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Informant Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedInformantCode(RelatedInformant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param relatedInformant The receiving '<em><b>Related Informant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRelatedInformantCode(RelatedInformant relatedInformant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_INFORMANT);
			try {
				VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RELATED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			relatedInformant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.RELATED_INFORMANT__RELATED_INFORMANT_CODE,
					ConsolPlugin.INSTANCE.getString("RelatedInformantCode"), new Object[] { relatedInformant }));
			}
			return false;
		}
		return true;
	}

} // RelatedInformantOperations
