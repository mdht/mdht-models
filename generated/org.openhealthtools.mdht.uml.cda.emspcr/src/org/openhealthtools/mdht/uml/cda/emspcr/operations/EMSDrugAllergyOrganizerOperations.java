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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#validateEMSDrugAllergyOrganizerEMSDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer EMS Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#getEMSDrugAllergies() <em>Get EMS Drug Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#getExistenceOfDrugAllergyObservation() <em>Get Existence Of Drug Allergy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSDrugAllergyOrganizerOperations extends org.eclipse.mdht.uml.cda.operations.OrganizerOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected EMSDrugAllergyOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDrugAllergyOrganizerEMSDrugAllergy(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer EMS Drug Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDrugAllergyOrganizerEMSDrugAllergy(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(emspcr::EMSDrugAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDrugAllergyOrganizerEMSDrugAllergy(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer EMS Drug Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDrugAllergyOrganizerEMSDrugAllergy(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDrugAllergyOrganizer The receiving '<em><b>EMS Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDrugAllergyOrganizerEMSDrugAllergy(
			EMSDrugAllergyOrganizer emsDrugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDrugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DRUG_ALLERGY_ORGANIZER__EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("EMSDrugAllergyOrganizerEMSDrugAllergyOrganizerEMSDrugAllergy"),
						 new Object [] { emsDrugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDrugAllergyOrganizer The receiving '<em><b>EMS Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(
			EMSDrugAllergyOrganizer emsDrugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDrugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DRUG_ALLERGY_ORGANIZER__EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDrugAllergyOrganizerEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation"),
						 new Object [] { emsDrugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEMSDrugAllergies(EMSDrugAllergyOrganizer) <em>Get EMS Drug Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(EMSDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMS_DRUG_ALLERGIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(emspcr::EMSDrugAllergy)).oclAsType(emspcr::EMSDrugAllergy)";

	/**
	 * The cached OCL query for the '{@link #getEMSDrugAllergies(EMSDrugAllergyOrganizer) <em>Get EMS Drug Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMSDrugAllergies(EMSDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMS_DRUG_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EMSDrugAllergy> getEMSDrugAllergies(EMSDrugAllergyOrganizer emsDrugAllergyOrganizer) {
	
	
	
		if (GET_EMS_DRUG_ALLERGIES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(54));
			try {
				GET_EMS_DRUG_ALLERGIES__EOCL_QRY = helper.createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EMS_DRUG_ALLERGIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EMSDrugAllergy> result = (Collection<EMSDrugAllergy>) query.evaluate(emsDrugAllergyOrganizer);
		return new BasicEList.UnmodifiableEList<EMSDrugAllergy>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer) <em>Get Existence Of Drug Allergy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugAllergyObservation))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugAllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer) <em>Get Existence Of Drug Allergy Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugAllergyObservation(EMSDrugAllergyOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ExistenceOfDrugAllergyObservation getExistenceOfDrugAllergyObservation(
			EMSDrugAllergyOrganizer emsDrugAllergyOrganizer) {
	
	
	
		if (GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER, EmspcrPackage.Literals.EMS_DRUG_ALLERGY_ORGANIZER.getEAllOperations().get(55));
			try {
				GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__EOCL_QRY);
		return (ExistenceOfDrugAllergyObservation) query.evaluate(emsDrugAllergyOrganizer);
	}

} // EMSDrugAllergyOrganizerOperations
