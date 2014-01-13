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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Existence Of Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerNonDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#getExistenceOfNonDrugAllergy() <em>Get Existence Of Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#getNonDrugAllergies() <em>Get Non Drug Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonDrugAllergyOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonDrugAllergyOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Existence Of Non Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfNonDrugAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Existence Of Non Drug Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergyOrganizer The receiving '<em><b>Non Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer nonDrugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonDrugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY_ORGANIZER__NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyOrganizerExistenceOfNonDrugAllergy"),
						 new Object [] { nonDrugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyOrganizerNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Non Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::NonDrugAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyOrganizerNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Non Drug Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerNonDrugAllergy(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergyOrganizer The receiving '<em><b>Non Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonDrugAllergyOrganizerNonDrugAllergy(NonDrugAllergyOrganizer nonDrugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonDrugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY_ORGANIZER__NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyOrganizerNonDrugAllergy"),
						 new Object [] { nonDrugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyOrganizerTemplateId(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerTemplateId(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.49')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyOrganizerTemplateId(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyOrganizerTemplateId(NonDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergyOrganizer The receiving '<em><b>Non Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonDrugAllergyOrganizerTemplateId(NonDrugAllergyOrganizer nonDrugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonDrugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY_ORGANIZER__NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyOrganizerTemplateId"),
						 new Object [] { nonDrugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer) <em>Get Existence Of Non Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfNonDrugAllergy))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfNonDrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer) <em>Get Existence Of Non Drug Allergy</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExistenceOfNonDrugAllergy getExistenceOfNonDrugAllergy(NonDrugAllergyOrganizer nonDrugAllergyOrganizer) {
		if (GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(55));
			try {
				GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXISTENCE_OF_NON_DRUG_ALLERGY__EOCL_QRY);
		return (ExistenceOfNonDrugAllergy) query.evaluate(nonDrugAllergyOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonDrugAllergies(NonDrugAllergyOrganizer) <em>Get Non Drug Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonDrugAllergies(NonDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_DRUG_ALLERGIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::NonDrugAllergy)).oclAsType(emspcr::NonDrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getNonDrugAllergies(NonDrugAllergyOrganizer) <em>Get Non Drug Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonDrugAllergies(NonDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_DRUG_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<NonDrugAllergy> getNonDrugAllergies(NonDrugAllergyOrganizer nonDrugAllergyOrganizer) {
		if (GET_NON_DRUG_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.NON_DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(56));
			try {
				GET_NON_DRUG_ALLERGIES__EOCL_QRY = helper.createQuery(GET_NON_DRUG_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_DRUG_ALLERGIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonDrugAllergy> result = (Collection<NonDrugAllergy>) query.evaluate(nonDrugAllergyOrganizer);
		return new BasicEList.UnmodifiableEList<NonDrugAllergy>(result.size(), result.toArray());
	}

} // NonDrugAllergyOrganizerOperations