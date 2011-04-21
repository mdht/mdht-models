/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getIds() <em>Get Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#addId(org.openhealthtools.mdht.uml.hl7.datatypes.II) <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getCode() <em>Get Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#setCode(org.openhealthtools.mdht.uml.hl7.datatypes.CD) <em>Set Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation#setAgeObservation(org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation) <em>Set Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation#validateFamilyHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.FamilyHistoryObservation#validateFamilyHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryObservationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Observation toCDAType(FamilyHistoryObservation familyHistoryObservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<II> getIds(FamilyHistoryObservation familyHistoryObservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt>.
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IFamilyHistoryObservation addId(FamilyHistoryObservation familyHistoryObservation, II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD getCode(FamilyHistoryObservation familyHistoryObservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains exactly one [1..1] <tt><b>code</b></tt>.
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setCode(FamilyHistoryObservation familyHistoryObservation, CD value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(FamilyHistoryObservation) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::AgeObservation))->asSequence()->first().oclAsType(apitest::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(FamilyHistoryObservation) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(FamilyHistoryObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::FamilyHistoryObservation::ageObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::AgeObservation))->asSequence()->first().oclAsType(apitest::AgeObservation)
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IAgeObservation getAgeObservation(FamilyHistoryObservation familyHistoryObservation) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IFAMILY_HISTORY_OBSERVATION, DomainPackage.Literals.IFAMILY_HISTORY_OBSERVATION.getEAllOperations().get(5));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (IAgeObservation) query.evaluate(familyHistoryObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains zero or one [0..1] <tt><b>entryRelationship</b></tt>, such that.
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setAgeObservation(FamilyHistoryObservation familyHistoryObservation, IAgeObservation value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.22')
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("FamilyHistoryObservationTemplateId"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationId(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID,
						 APITestPlugin.INSTANCE.getString("FamilyHistoryObservationId"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param familyHistoryObservation The receiving '<em><b>Family History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.FAMILY_HISTORY_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE,
						 APITestPlugin.INSTANCE.getString("FamilyHistoryObservationStatusCode"),
						 new Object [] { familyHistoryObservation }));
			}
			return false;
		}
		return true;
	}

} // FamilyHistoryObservationOperations