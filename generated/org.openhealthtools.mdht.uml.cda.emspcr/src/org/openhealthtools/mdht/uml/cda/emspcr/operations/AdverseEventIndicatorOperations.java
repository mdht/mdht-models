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

import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdverseEventIndicatorOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventIndicatorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventIndicatorTemplateId(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorTemplateId(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.89')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventIndicatorTemplateId(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorTemplateId(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventIndicator The receiving '<em><b>Adverse Event Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventIndicatorTemplateId(AdverseEventIndicator adverseEventIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_INDICATOR);
			try {
				VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_INDICATOR__ADVERSE_EVENT_INDICATOR_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventIndicatorTemplateId"),
						 new Object [] { adverseEventIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventIndicatorMoodCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorMoodCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventIndicatorMoodCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorMoodCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventIndicator The receiving '<em><b>Adverse Event Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventIndicatorMoodCode(AdverseEventIndicator adverseEventIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_INDICATOR);
			try {
				VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_INDICATOR__ADVERSE_EVENT_INDICATOR_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventIndicatorMoodCode"),
						 new Object [] { adverseEventIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventIndicatorCodeP(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorCodeP(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventIndicatorCodeP(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorCodeP(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventIndicator The receiving '<em><b>Adverse Event Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventIndicatorCodeP(AdverseEventIndicator adverseEventIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_INDICATOR);
			try {
				VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_INDICATOR__ADVERSE_EVENT_INDICATOR_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventIndicatorCodeP"),
						 new Object [] { adverseEventIndicator }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicatorCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicatorCodeP", passToken);
				}
				passToken.add(adverseEventIndicator);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventIndicatorCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67554-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventIndicatorCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorCode(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventIndicator The receiving '<em><b>Adverse Event Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventIndicatorCode(AdverseEventIndicator adverseEventIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicatorCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(adverseEventIndicator)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_INDICATOR);
			try {
				VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_INDICATOR__ADVERSE_EVENT_INDICATOR_CODE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventIndicatorCode"),
						 new Object [] { adverseEventIndicator }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdverseEventIndicatorValue(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorValue(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdverseEventIndicatorValue(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdverseEventIndicatorValue(AdverseEventIndicator, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param adverseEventIndicator The receiving '<em><b>Adverse Event Indicator</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdverseEventIndicatorValue(AdverseEventIndicator adverseEventIndicator, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADVERSE_EVENT_INDICATOR);
			try {
				VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEventIndicator)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADVERSE_EVENT_INDICATOR__ADVERSE_EVENT_INDICATOR_VALUE,
						 EmspcrPlugin.INSTANCE.getString("AdverseEventIndicatorValue"),
						 new Object [] { adverseEventIndicator }));
			}
			 
			return false;
		}
		return true;
	}

} // AdverseEventIndicatorOperations