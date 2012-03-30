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
import org.openhealthtools.mdht.uml.cda.consol.CodeObservations;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Code Observations</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations#validateCodeObservationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeObservationsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeObservationsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code Observations Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeObservationsTemplateId(CodeObservations, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.13')
	 * @param codeObservations The receiving '<em><b>Code Observations</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodeObservationsTemplateId(CodeObservations codeObservations,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CODE_OBSERVATIONS);
			try {
				VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_OBSERVATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codeObservations)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CODE_OBSERVATIONS__CODE_OBSERVATIONS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CodeObservationsTemplateId"), new Object[] { codeObservations }));
			}
			return false;
		}
		return true;
	}

} // CodeObservationsOperations
