/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Duration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration#validateComplaintDurationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintDurationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintDurationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintDurationTemplateId(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationTemplateId(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.139')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintDurationTemplateId(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationTemplateId(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintDuration The receiving '<em><b>Complaint Duration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintDurationTemplateId(ComplaintDuration complaintDuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_DURATION);
			try {
				VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_DURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaintDuration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT_DURATION__COMPLAINT_DURATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ComplaintDurationTemplateId"), new Object[] { complaintDuration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintDurationCodeP(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationCodeP(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintDurationCodeP(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationCodeP(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintDuration The receiving '<em><b>Complaint Duration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintDurationCodeP(ComplaintDuration complaintDuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_DURATION);
			try {
				VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_DURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaintDuration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT_DURATION__COMPLAINT_DURATION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ComplaintDurationCodeP"), new Object[] { complaintDuration }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDurationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDurationCodeP", passToken);
				}
				passToken.add(complaintDuration);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintDurationCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67491-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintDurationCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintDuration The receiving '<em><b>Complaint Duration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintDurationCode(ComplaintDuration complaintDuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDurationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(complaintDuration)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_DURATION);
			try {
				VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_DURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaintDuration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT_DURATION__COMPLAINT_DURATION_CODE,
					EmspcrPlugin.INSTANCE.getString("ComplaintDurationCode"), new Object[] { complaintDuration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintDurationValue(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationValue(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintDurationValue(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationValue(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintDuration The receiving '<em><b>Complaint Duration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintDurationValue(ComplaintDuration complaintDuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_DURATION);
			try {
				VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_DURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaintDuration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT_DURATION__COMPLAINT_DURATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ComplaintDurationValue"), new Object[] { complaintDuration }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintDurationMoodCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationMoodCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintDurationMoodCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Duration Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintDurationMoodCode(ComplaintDuration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintDuration The receiving '<em><b>Complaint Duration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintDurationMoodCode(ComplaintDuration complaintDuration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_DURATION);
			try {
				VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_DURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaintDuration)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT_DURATION__COMPLAINT_DURATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ComplaintDurationMoodCode"), new Object[] { complaintDuration }));
			}

			return false;
		}
		return true;
	}

} // ComplaintDurationOperations
