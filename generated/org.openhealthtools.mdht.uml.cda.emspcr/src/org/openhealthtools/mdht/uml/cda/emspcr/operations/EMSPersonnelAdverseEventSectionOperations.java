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
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Personnel Adverse Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getAdverseEventIndicator() <em>Get Adverse Event Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection#getAdverseEventTypeObservations() <em>Get Adverse Event Type Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPersonnelAdverseEventSectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
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
	protected EMSPersonnelAdverseEventSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionTemplateId(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionTemplateId(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionTemplateId"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67658-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionCode(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionCode(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionCode"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionCodeP(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionCodeP(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionCodeP"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Exposures or Injuries of EMS Personnel')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionTitle(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionTitle(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionTitle"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionText(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionText(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionText"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AdverseEventIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionAdverseEventIndicator(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_INDICATOR,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionAdverseEventIndicator"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AdverseEventTypeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Personnel Adverse Event Section Adverse Event Type Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(EMSPersonnelAdverseEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPersonnelAdverseEventSection The receiving '<em><b>EMS Personnel Adverse Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPersonnelAdverseEventSectionAdverseEventTypeObservation(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION);
			try {
				VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPersonnelAdverseEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PERSONNEL_ADVERSE_EVENT_SECTION__EMS_PERSONNEL_ADVERSE_EVENT_SECTION_ADVERSE_EVENT_TYPE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSPersonnelAdverseEventSectionEMSPersonnelAdverseEventSectionAdverseEventTypeObservation"),
						 new Object [] { emsPersonnelAdverseEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdverseEventIndicator(EMSPersonnelAdverseEventSection) <em>Get Adverse Event Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventIndicator(EMSPersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVERSE_EVENT_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AdverseEventIndicator))->asSequence()->any(true).oclAsType(emspcr::AdverseEventIndicator)";

	/**
	 * The cached OCL query for the '{@link #getAdverseEventIndicator(EMSPersonnelAdverseEventSection) <em>Get Adverse Event Indicator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventIndicator(EMSPersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdverseEventIndicator getAdverseEventIndicator(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection) {
	
	
	
		if (GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(62));
			try {
				GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY = helper.createQuery(GET_ADVERSE_EVENT_INDICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVERSE_EVENT_INDICATOR__EOCL_QRY);
		return (AdverseEventIndicator) query.evaluate(emsPersonnelAdverseEventSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdverseEventTypeObservations(EMSPersonnelAdverseEventSection) <em>Get Adverse Event Type Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventTypeObservations(EMSPersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AdverseEventTypeObservation)).oclAsType(emspcr::AdverseEventTypeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAdverseEventTypeObservations(EMSPersonnelAdverseEventSection) <em>Get Adverse Event Type Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdverseEventTypeObservations(EMSPersonnelAdverseEventSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdverseEventTypeObservation> getAdverseEventTypeObservations(
			EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection) {
	
	
	
		if (GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION, EmspcrPackage.Literals.EMS_PERSONNEL_ADVERSE_EVENT_SECTION.getEAllOperations().get(63));
			try {
				GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVERSE_EVENT_TYPE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdverseEventTypeObservation> result = (Collection<AdverseEventTypeObservation>) query.evaluate(emsPersonnelAdverseEventSection);
		return new BasicEList.UnmodifiableEList<AdverseEventTypeObservation>(result.size(), result.toArray());
	}

} // EMSPersonnelAdverseEventSectionOperations
