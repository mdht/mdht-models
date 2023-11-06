/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerV4Operations extends OrganizerOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOrganizerV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.1' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerV4TemplateId(ResultOrganizerV4 resultOrganizerV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultOrganizerV4ResultOrganizerV4TemplateId", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(resultOrganizerV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ResultOrganizerV4ResultOrganizerV4TemplateId"),
						new Object[] { resultOrganizerV4 }));
			}

			return false;
		}
		return true;
	}

} // ResultOrganizerV4Operations
