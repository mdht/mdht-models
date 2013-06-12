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
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies;
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Environmental Allergies</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Existence Of Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesEnvironmentalAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#getExistenceOfEnvironmentalAllergy() <em>Get Existence Of Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentalAllergiesOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalAllergiesOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Existence Of Environmental Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::ExistenceOfEnvironmentalAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Existence Of Environmental Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param environmentalAllergies The receiving '<em><b>Environmental Allergies</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(EnvironmentalAllergies environmentalAllergies, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(environmentalAllergies)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ENVIRONMENTAL_ALLERGIES__ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergiesExistenceOfEnvironmentalAllergy"),
						 new Object [] { environmentalAllergies }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEnvironmentalAllergiesEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Environmental Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::EnvironmentalAllergy))";

	/**
	 * The cached OCL invariant for the '{@link #validateEnvironmentalAllergiesEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Environmental Allergy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesEnvironmentalAllergy(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param environmentalAllergies The receiving '<em><b>Environmental Allergies</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEnvironmentalAllergiesEnvironmentalAllergy(EnvironmentalAllergies environmentalAllergies, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(environmentalAllergies)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ENVIRONMENTAL_ALLERGIES__ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY,
						 EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergiesEnvironmentalAllergy"),
						 new Object [] { environmentalAllergies }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEnvironmentalAllergiesTemplateId(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesTemplateId(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.49')";

	/**
	 * The cached OCL invariant for the '{@link #validateEnvironmentalAllergiesTemplateId(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnvironmentalAllergiesTemplateId(EnvironmentalAllergies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param environmentalAllergies The receiving '<em><b>Environmental Allergies</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEnvironmentalAllergiesTemplateId(EnvironmentalAllergies environmentalAllergies, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES);
			try {
				VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(environmentalAllergies)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ENVIRONMENTAL_ALLERGIES__ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EnvironmentalAllergiesTemplateId"),
						 new Object [] { environmentalAllergies }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfEnvironmentalAllergy(EnvironmentalAllergies) <em>Get Existence Of Environmental Allergy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfEnvironmentalAllergy(EnvironmentalAllergies)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfEnvironmentalAllergy))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfEnvironmentalAllergy)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfEnvironmentalAllergy(EnvironmentalAllergies) <em>Get Existence Of Environmental Allergy</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfEnvironmentalAllergy(EnvironmentalAllergies)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExistenceOfEnvironmentalAllergy getExistenceOfEnvironmentalAllergy(EnvironmentalAllergies environmentalAllergies) {
		if (GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES, EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES.getEAllOperations().get(55));
			try {
				GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__EOCL_QRY);
		return (ExistenceOfEnvironmentalAllergy) query.evaluate(environmentalAllergies);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEnvironmentalAllergies(EnvironmentalAllergies) <em>Get Environmental Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(EnvironmentalAllergies)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::EnvironmentalAllergy)).oclAsType(emspcr::EnvironmentalAllergy)";

	/**
	 * The cached OCL query for the '{@link #getEnvironmentalAllergies(EnvironmentalAllergies) <em>Get Environmental Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalAllergies(EnvironmentalAllergies)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<EnvironmentalAllergy> getEnvironmentalAllergies(EnvironmentalAllergies environmentalAllergies) {
		if (GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES, EmspcrPackage.Literals.ENVIRONMENTAL_ALLERGIES.getEAllOperations().get(56));
			try {
				GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY = helper.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENVIRONMENTAL_ALLERGIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EnvironmentalAllergy> result = (Collection<EnvironmentalAllergy>) query.evaluate(environmentalAllergies);
		return new BasicEList.UnmodifiableEList<EnvironmentalAllergy>(result.size(), result.toArray());
	}

} // EnvironmentalAllergiesOperations