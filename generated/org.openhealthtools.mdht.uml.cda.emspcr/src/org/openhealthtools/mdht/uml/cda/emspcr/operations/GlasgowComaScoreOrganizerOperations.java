/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Coma Score Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowEye(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Eye</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowMotor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Motor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowTotal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Total</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowVerbal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Verbal</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowEye() <em>Get Glasgow Eye</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowMotor() <em>Get Glasgow Motor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowQualifier() <em>Get Glasgow Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowTotal() <em>Get Glasgow Total</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowVerbal() <em>Get Glasgow Verbal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlasgowComaScoreOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowComaScoreOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerGlasgowEye(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Eye</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowEye(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::GlasgowEye))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerGlasgowEye(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Eye</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowEye(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerGlasgowEye(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowEye"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerGlasgowMotor(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Motor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowMotor(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::GlasgowMotor))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerGlasgowMotor(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Motor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowMotor(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerGlasgowMotor(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowMotor"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerGlasgowQualifier(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowQualifier(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::GlasgowQualifier))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerGlasgowQualifier(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowQualifier(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerGlasgowQualifier(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowQualifier"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerGlasgowTotal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowTotal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::GlasgowTotal))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerGlasgowTotal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Total</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowTotal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerGlasgowTotal(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowTotal"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerGlasgowVerbal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Verbal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowVerbal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(emspcr::GlasgowVerbal))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerGlasgowVerbal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Verbal</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerGlasgowVerbal(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerGlasgowVerbal(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowVerbal"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.170')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerTemplateId"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerEffectiveTime"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowEye(GlasgowComaScoreOrganizer) <em>Get Glasgow Eye</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowEye(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_EYE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::GlasgowEye))->asSequence()->any(true).oclAsType(emspcr::GlasgowEye)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowEye(GlasgowComaScoreOrganizer) <em>Get Glasgow Eye</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowEye(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_EYE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GlasgowEye getGlasgowEye(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer) {
		if (GET_GLASGOW_EYE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER, EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER.getEAllOperations().get(59));
			try {
				GET_GLASGOW_EYE__EOCL_QRY = helper.createQuery(GET_GLASGOW_EYE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_EYE__EOCL_QRY);
		return (GlasgowEye) query.evaluate(glasgowComaScoreOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowMotor(GlasgowComaScoreOrganizer) <em>Get Glasgow Motor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowMotor(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_MOTOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::GlasgowMotor))->asSequence()->any(true).oclAsType(emspcr::GlasgowMotor)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowMotor(GlasgowComaScoreOrganizer) <em>Get Glasgow Motor</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowMotor(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_MOTOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GlasgowMotor getGlasgowMotor(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer) {
		if (GET_GLASGOW_MOTOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER, EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER.getEAllOperations().get(60));
			try {
				GET_GLASGOW_MOTOR__EOCL_QRY = helper.createQuery(GET_GLASGOW_MOTOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_MOTOR__EOCL_QRY);
		return (GlasgowMotor) query.evaluate(glasgowComaScoreOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowQualifier(GlasgowComaScoreOrganizer) <em>Get Glasgow Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowQualifier(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_QUALIFIER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::GlasgowQualifier))->asSequence()->any(true).oclAsType(emspcr::GlasgowQualifier)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowQualifier(GlasgowComaScoreOrganizer) <em>Get Glasgow Qualifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowQualifier(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_QUALIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GlasgowQualifier getGlasgowQualifier(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer) {
		if (GET_GLASGOW_QUALIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER, EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER.getEAllOperations().get(61));
			try {
				GET_GLASGOW_QUALIFIER__EOCL_QRY = helper.createQuery(GET_GLASGOW_QUALIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_QUALIFIER__EOCL_QRY);
		return (GlasgowQualifier) query.evaluate(glasgowComaScoreOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowTotal(GlasgowComaScoreOrganizer) <em>Get Glasgow Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowTotal(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_TOTAL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::GlasgowTotal))->asSequence()->any(true).oclAsType(emspcr::GlasgowTotal)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowTotal(GlasgowComaScoreOrganizer) <em>Get Glasgow Total</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowTotal(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_TOTAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GlasgowTotal getGlasgowTotal(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer) {
		if (GET_GLASGOW_TOTAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER, EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER.getEAllOperations().get(62));
			try {
				GET_GLASGOW_TOTAL__EOCL_QRY = helper.createQuery(GET_GLASGOW_TOTAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_TOTAL__EOCL_QRY);
		return (GlasgowTotal) query.evaluate(glasgowComaScoreOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGlasgowVerbal(GlasgowComaScoreOrganizer) <em>Get Glasgow Verbal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowVerbal(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GLASGOW_VERBAL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::GlasgowVerbal))->asSequence()->any(true).oclAsType(emspcr::GlasgowVerbal)";

	/**
	 * The cached OCL query for the '{@link #getGlasgowVerbal(GlasgowComaScoreOrganizer) <em>Get Glasgow Verbal</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlasgowVerbal(GlasgowComaScoreOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GLASGOW_VERBAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GlasgowVerbal getGlasgowVerbal(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer) {
		if (GET_GLASGOW_VERBAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER, EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER.getEAllOperations().get(63));
			try {
				GET_GLASGOW_VERBAL__EOCL_QRY = helper.createQuery(GET_GLASGOW_VERBAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GLASGOW_VERBAL__EOCL_QRY);
		return (GlasgowVerbal) query.evaluate(glasgowComaScoreOrganizer);
	}

} // GlasgowComaScoreOrganizerOperations