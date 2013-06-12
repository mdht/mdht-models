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

import org.openhealthtools.mdht.uml.cda.emspcr.Complaint;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintComplaintDurationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Duration Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintComplaintTypeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Type Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintComplaintOrganSystemRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Organ System Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint#validateComplaintMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ComplaintOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintComplaintDurationRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Duration Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintDurationRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintComplaintDurationRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Duration Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintDurationRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintComplaintDurationRelationship(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_COMPLAINT_DURATION_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("ComplaintComplaintDurationRelationship"),
					new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintComplaintTypeRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Type Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintTypeRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintComplaintTypeRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Type Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintTypeRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintComplaintTypeRelationship(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_COMPLAINT_TYPE_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("ComplaintComplaintTypeRelationship"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintComplaintOrganSystemRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Organ System Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintOrganSystemRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintComplaintOrganSystemRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Complaint Organ System Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintComplaintOrganSystemRelationship(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintComplaintOrganSystemRelationship(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_COMPLAINT_ORGAN_SYSTEM_RELATIONSHIP,
					EmspcrPlugin.INSTANCE.getString("ComplaintComplaintOrganSystemRelationship"),
					new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintTemplateId(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTemplateId(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.63')";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintTemplateId(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTemplateId(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintTemplateId(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ComplaintTemplateId"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintCodeP(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.COMPLAINT__COMPLAINT_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ComplaintCodeP"), new Object[] { complaint }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintCodeP", passToken);
				}
				passToken.add(complaint);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '10154-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintCode(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(complaint)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.COMPLAINT__COMPLAINT_CODE,
					EmspcrPlugin.INSTANCE.getString("ComplaintCode"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintValue(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintValue(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::ST)))";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintValue(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintValue(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintValue(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE, EmspcrValidator.COMPLAINT__COMPLAINT_VALUE,
					EmspcrPlugin.INSTANCE.getString("ComplaintValue"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintTargetSiteCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTargetSiteCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA12703-7' or value.code = 'LA12705-2' or value.code = 'LA12706-0' or value.code = 'LA18111-7' or value.code = 'LA18112-5' or value.code = 'LA18113-3' or value.code = 'LA18114-1' or value.code = 'LA18115-8' or value.code = 'LA18116-6')))";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintTargetSiteCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTargetSiteCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintTargetSiteCode(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_TARGET_SITE_CODE,
					EmspcrPlugin.INSTANCE.getString("ComplaintTargetSiteCode"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintTargetSiteCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTargetSiteCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintTargetSiteCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Target Site Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintTargetSiteCodeP(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintTargetSiteCodeP(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_TARGET_SITE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ComplaintTargetSiteCodeP"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintEffectiveTime(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintEffectiveTime(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintEffectiveTime(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintEffectiveTime(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintEffectiveTime(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("ComplaintEffectiveTime"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateComplaintMoodCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintMoodCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateComplaintMoodCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateComplaintMoodCode(Complaint, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param complaint The receiving '<em><b>Complaint</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateComplaintMoodCode(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT);
			try {
				VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaint)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.COMPLAINT__COMPLAINT_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ComplaintMoodCode"), new Object[] { complaint }));
			}

			return false;
		}
		return true;
	}

} // ComplaintOperations
