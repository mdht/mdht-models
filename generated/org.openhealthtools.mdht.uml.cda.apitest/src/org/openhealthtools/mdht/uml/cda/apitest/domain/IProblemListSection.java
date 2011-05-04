/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProblem List Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This section lists and describes all relevant clinical problems at the time the summary is generated. At a minimum, all pertinent current and historical problems should be listed. CDA R2 represents problems as Observations.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIProblemListSection()
 * @generated
 */
public interface IProblemListSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Section toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::title.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section SHALL contain exactly one [1..1] title (CONF-143).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ST value = (ST) eObject;
	 * setTitle(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section SHALL contain exactly one [1..1] title (CONF-143).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection withTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::text.
	 * self.text.oclAsType(cda::StrucDocText)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section SHALL contain exactly one [1..1] text (CONF-140).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("StrucDocText");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * StrucDocText value = (StrucDocText) eObject;
	 * setText(value);
	 * return value;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	StrucDocText withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section SHALL contain exactly one [1..1] text (CONF-140).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("StrucDocText");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection withText(StrucDocText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section Contains at least one [1..*] entry, such that Contains exactly one [1..1] Condition (templateId: 2.16.840.1.113883.3.88.11.83.7).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Condition");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ICondition clinicalStatement = (ICondition) eObject;
	 * clinicalStatement.init();
	 * addAct((org.openhealthtools.mdht.uml.cda.Act)clinicalStatement);
	 * return clinicalStatement;
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICondition addCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Problem List Section Contains at least one [1..*] entry, such that Contains exactly one [1..1] Condition (templateId: 2.16.840.1.113883.3.88.11.83.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemListSection addCondition(ICondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection init();
} // IProblemListSection
