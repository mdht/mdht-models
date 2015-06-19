/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;

import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipINTValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship INT Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipPolicyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Policy Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#getConsolPolicyActivity2s() <em>Get Consol Policy Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCoverageActivityRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Coverage Activity Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageActivity2Operations extends CoverageActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivity2Operations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivityCodeP(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivityCodeP"),
					new Object[] { coverageActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CoverageActivityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CoverageActivityCodeP", passToken);
				}
				passToken.add(coverageActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2EntryRelationship(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationship(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2EntryRelationship(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationship(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivity2EntryRelationship(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivity2EntryRelationship"),
					new Object[] { coverageActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2EntryRelationshipINTValue(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship INT Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipINTValue(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).sequenceNumber->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2EntryRelationshipINTValue(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship INT Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipINTValue(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCoverageActivity2EntryRelationshipINTValue(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(coverageActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE,
						ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivity2EntryRelationshipINTValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2EntryRelationshipTypeCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipTypeCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2EntryRelationshipTypeCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipTypeCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCoverageActivity2EntryRelationshipTypeCode(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(coverageActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivity2EntryRelationshipTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2EntryRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Sequence Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject((sequenceNumber.oclIsUndefined() or sequenceNumber.isNullFlavorUndefined()) implies (not sequenceNumber.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2EntryRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Sequence Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCoverageActivity2EntryRelationshipSequenceNumber(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(coverageActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER,
						ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivity2EntryRelationshipSequenceNumber"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2EntryRelationshipPolicyActivity2(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Policy Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipPolicyActivity2(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2EntryRelationshipPolicyActivity2(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Policy Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2EntryRelationshipPolicyActivity2(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCoverageActivity2EntryRelationshipPolicyActivity2(
			CoverageActivity2 coverageActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(coverageActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2,
						ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivity2EntryRelationshipPolicyActivity2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPolicyActivity2s(CoverageActivity2) <em>Get Consol Policy Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPolicyActivity2s(CoverageActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_POLICY_ACTIVITY2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity2)).oclAsType(consol::PolicyActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolPolicyActivity2s(CoverageActivity2) <em>Get Consol Policy Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPolicyActivity2s(CoverageActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_POLICY_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PolicyActivity2> getConsolPolicyActivity2s(CoverageActivity2 coverageActivity2) {
		if (GET_CONSOL_POLICY_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COVERAGE_ACTIVITY2,
				ConsolPackage.Literals.COVERAGE_ACTIVITY2.getEAllOperations().get(67));
			try {
				GET_CONSOL_POLICY_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_POLICY_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_POLICY_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PolicyActivity2> result = (Collection<PolicyActivity2>) query.evaluate(coverageActivity2);
		return new BasicEList.UnmodifiableEList<PolicyActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityCoverageActivityRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Coverage Activity Relationship Sequence Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCoverageActivityRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityCoverageActivityRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Coverage Activity Relationship Sequence Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCoverageActivityRelationshipSequenceNumber(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivityCoverageActivityRelationshipSequenceNumber(
			CoverageActivity2 coverageActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER,
					ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivityCoverageActivityRelationshipSequenceNumber"),
					new Object[] { coverageActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityTemplateId(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.60' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityTemplateId(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityCodeP(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCodeP(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityCodeP(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCodeP(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivityTemplateId(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivityTemplateId"),
					new Object[] { coverageActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityCode(CoverageActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivity2 The receiving '<em><b>Coverage Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivityCode(CoverageActivity2 coverageActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CoverageActivityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(coverageActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY2);
			try {
				VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY2__COVERAGE_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("CoverageActivity2CoverageActivityCode"),
					new Object[] { coverageActivity2 }));
			}

			return false;
		}
		return true;
	}

} // CoverageActivity2Operations
