/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

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
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsePreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStartRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStopRelativetoReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseEventDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Event Duration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getStartRelativetoReferencePeriod() <em>Get Start Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getStopRelativetoReferencePeriod() <em>Get Stop Relativeto Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getEventDuration() <em>Get Event Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceUseOperations extends org.eclipse.mdht.uml.cda.operations.SubstanceAdministrationOperations {
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
	protected SubstanceUseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.95')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseTemplateId(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseClassCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseMoodCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseId(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseStatusCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseText(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseEffectiveTime(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseDoseQuantity(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseMaxDoseQuantity(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_MAX_DOSE_QUANTITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseRouteCodeP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRouteCodeP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseRouteCodeP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRouteCodeP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseRouteCodeP(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ROUTE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseRouteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseRouteCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ROUTE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::ConsumableMaterial))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseConsumableMaterial(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_CONSUMABLE_MATERIAL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PreSpecifiedEvent) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUsePreSpecifiedEvent(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_PRE_SPECIFIED_EVENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUsePreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseNonPerformanceReason(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseDataCollection(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseStudyDayPeriod(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseComment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseComment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseComment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseComment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseComment(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseDomainAssignment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDomainAssignment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseDomainAssignment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseDomainAssignment(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseDomainAssignment(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseRelatedRecord(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRelatedRecord(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseRelatedRecord(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseRelatedRecord(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseRelatedRecord(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseSupplementalValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseSupplementalValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseSupplementalValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseSupplementalValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseSupplementalValue(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseStartRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStartRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseStartRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Start Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStartRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseStartRelativetoReferencePeriod(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_START_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseStartRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseStopRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStopRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseStopRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Stop Relativeto Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseStopRelativetoReferencePeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseStopRelativetoReferencePeriod(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_STOP_RELATIVETO_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseStopRelativetoReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseCategory(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseSubCategory(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseFindingAbout(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseFindingAbout(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseFindingAbout(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseFindingAbout(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseFindingAbout(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceUseEventDuration(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseEventDuration(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventDuration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceUseEventDuration(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Event Duration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceUseEventDuration(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSubstanceUseEventDuration(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
			try {
				VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SUBSTANCE_USE_EVENT_DURATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(substanceUse)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_EVENT_DURATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseEventDuration", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
						 new Object [] { substanceUse }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(SubstanceUse) <em>Get Pre Specified Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PreSpecifiedEvent))->asSequence()->any(true).oclAsType(sdtm::PreSpecifiedEvent)";

	/**
	 * The cached OCL query for the '{@link #getPreSpecifiedEvent(SubstanceUse) <em>Get Pre Specified Event</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSpecifiedEvent(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PreSpecifiedEvent getPreSpecifiedEvent(SubstanceUse substanceUse) {
	
	
	
		if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(78));
			try {
				GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
		return (PreSpecifiedEvent) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(SubstanceUse) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(SubstanceUse) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(SubstanceUse substanceUse) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(79));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(SubstanceUse) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(SubstanceUse) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(SubstanceUse substanceUse) {
	
	
	
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(80));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(SubstanceUse) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(SubstanceUse) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(SubstanceUse substanceUse) {
	
	
	
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(81));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(SubstanceUse) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(SubstanceUse) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(SubstanceUse substanceUse) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(82));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(substanceUse);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(SubstanceUse) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(SubstanceUse) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(SubstanceUse substanceUse) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(83));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(SubstanceUse) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(SubstanceUse) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(SubstanceUse substanceUse) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(84));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(substanceUse);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(SubstanceUse) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(SubstanceUse) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(SubstanceUse substanceUse) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(85));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(substanceUse);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStartRelativetoReferencePeriod(SubstanceUse) <em>Get Start Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StartRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StartRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStartRelativetoReferencePeriod(SubstanceUse) <em>Get Start Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRelativetoReferencePeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StartRelativetoReferencePeriod getStartRelativetoReferencePeriod(SubstanceUse substanceUse) {
	
	
	
		if (GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(86));
			try {
				GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_START_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StartRelativetoReferencePeriod) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStopRelativetoReferencePeriod(SubstanceUse) <em>Get Stop Relativeto Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StopRelativetoReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::StopRelativetoReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getStopRelativetoReferencePeriod(SubstanceUse) <em>Get Stop Relativeto Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRelativetoReferencePeriod(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StopRelativetoReferencePeriod getStopRelativetoReferencePeriod(SubstanceUse substanceUse) {
	
	
	
		if (GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(87));
			try {
				GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_STOP_RELATIVETO_REFERENCE_PERIOD__EOCL_QRY);
		return (StopRelativetoReferencePeriod) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(SubstanceUse) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(SubstanceUse) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(SubstanceUse substanceUse) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(88));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(SubstanceUse) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(SubstanceUse) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(SubstanceUse substanceUse) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(89));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(substanceUse);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(SubstanceUse) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(SubstanceUse) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(SubstanceUse substanceUse) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(90));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(substanceUse);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventDuration(SubstanceUse) <em>Get Event Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_DURATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventDuration))->asSequence()->any(true).oclAsType(sdtm::EventDuration)";

	/**
	 * The cached OCL query for the '{@link #getEventDuration(SubstanceUse) <em>Get Event Duration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDuration(SubstanceUse)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_DURATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventDuration getEventDuration(SubstanceUse substanceUse) {
	
	
	
		if (GET_EVENT_DURATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(91));
			try {
				GET_EVENT_DURATION__EOCL_QRY = helper.createQuery(GET_EVENT_DURATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EVENT_DURATION__EOCL_QRY);
		return (EventDuration) query.evaluate(substanceUse);
	}

} // SubstanceUseOperations